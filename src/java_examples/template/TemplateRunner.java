package template;

/**
 * Runner for our template design pattern example
 *
 *
 * */
public class TemplateRunner {


    public static void main(String[] args) {
        // first create the specific connection type we want
        ConnectionTemplate sqlCon = new MYSQLCSVCON();

        sqlCon.run();


        // then the next one
        ConnectionTemplate oracleCon = new ORACLETXTCON();
        oracleCon.run();


        /**
         *
         * the key here is that the runtime isn't the focus. It's the compile time, i.e. making all these
         * specific methods easier to implement because we have one template class that provides the majority
         * of the work already done and all we have to do is only implement a few methods ...
         *
         * */
    }
}
