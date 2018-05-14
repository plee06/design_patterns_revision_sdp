package template;

public class ORACLETXTCON extends ConnectionTemplate {
    @Override
    public void setDBDriver() {
        System.out.println("Setting Oracle DB Drivers ... ");
    }

    @Override
    public void setCredentials() {
        System.out.println("Setting credentials for Oracle DB .... ");
    }

    @Override
    public void setData() {
        System.out.println("Setting up data from txt file .....");

    }
}
