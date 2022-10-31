package IAM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


/**
 * Executes the native commands.
 * 
 * @author Deep Purohit
 *
 */

public class CommandExecutor {


    /**
     * Executes the command in the form of a separate process. The process will not return until the
     * completion of command.
     * 
     * @param command The command to execute
     * @throws Exception
     */
    public void execute(final String... command) throws Exception{
        if (null == command || command.length == 0) {
            throw new Exception("Empty command came for execution " + command);
        }

        ProcessBuilder builder = new ProcessBuilder(command);
        builder.redirectErrorStream(true);
        final Process process;
        try {
            process = builder.start();
            final InputStream is = process.getInputStream();

            new Thread(new Runnable() {
                public void run() {
                    try {
                        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                        String line;
                        while ((line = reader.readLine()) != null) {
                          //  LOG.debug("<EXECUTE RESULT> " + line);
                        }
                    } catch (IOException e) {
                        //LOG.error("Error while executing command " + command[0], e);
                    } finally {
                        if (null != is) {
                            try {
                                is.close();
                            } catch (IOException e) {
                             //   LOG.error("Error while closing InputStream for command execution ", e);
                            }
                        }
                    }
                }
            }).start();

            new Thread(new Runnable() {
                public void run() {
                    OutputStreamWriter s = null;
                    try {
                        s = new OutputStreamWriter(process.getOutputStream());
                        //If asks for overwrite
                        s.write("y");
                        s.write(System.getProperty("line.separator"));
                        s.flush();
                    } catch (IOException e) {
                       // LOG.error("Error writing to output stream during command execution ", e);
                    } finally {
                        if (null != s) {
                            try {
                                s.close();
                            } catch (IOException e) {
                                //LOG.error("Error while closing output stream of command execution ", e);
                            }
                        }
                    }
                }
            }).start();

            //Process should be completed successfully
            int code = process.waitFor();
          //  LOG.debug("Process exit value " + process.exitValue());

            if (code != 0) {
                throw new Exception("Command execution failed as process.waitFor() is " + code + ", process.exitValue() " + process.exitValue() + ", for command " + Arrays.asList(
                                command));
            }
        } catch (IOException e) {
            throw new Exception("Command start failed IOException" + Arrays.asList(command), e);
        } catch (InterruptedException e) {
            throw new Exception("Command execution failed InterruptedException" + Arrays.asList(command), e);
        }
    }

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutor();
        try {
          //  executor.execute(new String[] {"java", "-version"});
            String trustStore = "-cacerts";
            //String trustFile="C:\\IAM\\Sandbox\\configservice\\code\\src\\main\\resources\\cert\\iwaswidmvmap11.cer";
            String keystorePassword="changeit";
           // String command = "keytool -noprompt -import -alias CertificateAgentCA -keystore " + trustStore + " -file " + trustFile + " -storepass " + keystorePassword;

            String command ="keytool -import -alias pingcert -cacerts -storepass changeit -file iwaswidmvmap11.cer -noprompt";

            executor.execute( "cmd.exe", "/c", "dir C:\\Users\\kalpanaautade",command );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
