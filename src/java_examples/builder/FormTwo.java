package java_examples.builder;

/**
 * The better way of building out a complex Object with tons of fields ...
 *
 * */
public class FormTwo {

    /**
     * Imagine a bunch of instance variables here ...
     *
     * */
    private String a;
    private String b;
    private String c;
    private String d;

    // our static class FormBuilder which allows the Client to "build up" the object they want
    public static class FormBuilder {
        private String a;
        private String b;
        private String c;
        private String d;

        // our consturctor with the two REQUIRED parameters i.e. a and b
        public FormBuilder(String a, String b) {
            this.a = a;
            this.b = b;
        }

        // we then have setter methods on this builder object that the client uses to set appropriate
        // "extra" parameters and it returns the new object with this prop set
        FormBuilder setC(String c) {
            this.c = c;
            return this;
        }
        FormBuilder setD(String d) {
            this.d = d;
            return this;
        }

        // and finally our build method that will return the final Form with everything that was built
        // within FormBuilder
        FormTwo build() {
            return new FormTwo(this);
        }
    }

    // this is our constructor that is only available internally!!! our Builder object
    // returns the Form based on what the Client wanted built which is all set in our Builder object
    private FormTwo(FormBuilder formBuilder) {
        this.a = formBuilder.a;
        this.b = formBuilder.b;
        this.c = formBuilder.c;
        this.d = formBuilder.d;
    }

    // consider ...
    public static void main(String[] args) {
        // my option of only building with one extra parameter of setC!!!
        FormTwo form = new FormTwo
                .FormBuilder("required string A", "required string B")
                .setC("extra string C")
                .build();
    }

}
