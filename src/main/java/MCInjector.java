import mcp.mcinjector.MCInjectorImpl;

public class MCInjector
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("MCInjector v2.0 by Searge, LexManos, Fesh0r");

        if (args.length < 3)
        {
            System.out.println("MCInjector IN OUT MAPFILE [LOGFILE] [OUTMAP] [INDEX]");
            System.exit(1);
        }

        String inFile = args[0];
        String outFile = args[1];
        String mapFile = args[2];
        String logFile = null;
        if (args.length > 3)
        {
            logFile = args[3];
        }
        String outMapFile = null;
        if (args.length > 4)
        {
            outMapFile = args[4];
        }
        int index = 0;
        if (args.length > 5)
        {
            index = Integer.parseInt(args[5]);
        }

        try
        {
            MCInjectorImpl.process(inFile, outFile, mapFile, logFile, outMapFile, index);
        }
        catch (Exception e)
        {
            System.err.println("ERROR: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}