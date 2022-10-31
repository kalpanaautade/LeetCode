package May.Array.Map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ExpiringMap<K,V> extends ConcurrentHashMap<K,V> {

    Map<K, Long>  timedmap = new ConcurrentHashMap<K,Long>();
    public int expiretime=1000;

    public  ExpiringMap(int expiretimes)
    {
        expiretime=expiretimes;
        init();

    }
    private void init()
    {
        new cleanupthread().start();

    }

    @Override
    public V put(K key, V value) {
        Date dt = new Date();
        timedmap.put(key,dt.getTime());
       V returnval= super.put(key,value);
       return returnval;
    }



    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        for(K key: m.keySet() )
        {
            put(key, m.get(key) );
        }

    }

    @Override
    public V putIfAbsent(K key, V value) {
       if(!timedmap.containsKey(key))
          return put(key,value );
       else
           return value;
    }

    private void cleanuptask()
    {
        long currtime= new Date().getTime();
        for (K key: timedmap.keySet()) {
            if(currtime > timedmap.get(key)+expiretime)
            {
                timedmap.remove(key);
                super.remove(key);
            }
        }
    }

    class cleanupthread extends Thread
    {
        @Override
        public void run()
        {
            while(true) {
                cleanuptask();
                try {
                    Thread.sleep(expiretime / 2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
         }
    }

    public static void main(String[] args) throws InterruptedException {;

        List<Integer[]> result=new  ArrayList<>();

        ExpiringMap map = new ExpiringMap(1);
        map.put("1","111");
        map.put("2","222");
        map.put("3","333");

        System.out.println(map.size());
        Thread.sleep(2000);
        System.out.println(map.size());

        map.put("4","4444");
        map.put("5","555");
        map.put("6","666");
        map.put("7","777");

        System.out.println(map.size());
        Thread.sleep(2000);
        System.out.println(map.size());



    }
}
