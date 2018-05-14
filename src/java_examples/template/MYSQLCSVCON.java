package template;

/**
 * Concrete Database connection class ...
 *
 *
 *
 * */
public class MYSQLCSVCON extends ConnectionTemplate {
    @Override
    public void setDBDriver() {
        System.out.println("Setting MySQL Db Drivers....");

    }

    @Override
    public void setCredentials() {
        System.out.println("Setting credentials for MySQL DB.....");

    }

    @Override
    public void setData() {
        System.out.println("Setting up data from CSV File ....");

    }
}
