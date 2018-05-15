package java_examples.builder;

/**
 * Our Runner for the Builder Pattern
 *
 *
 * */
public class BuilderPatternRunner {
    public static void main(String[] args) {
        // First we build our CarBuilders
        // Remember that the Builder handles all the logic for the building up of a car
        // Right now our client wants a Sedan type of constructor
        CarBuilder carBuilder = new SedanCarBuilder();

        // then we create our director and pass in the appropriate builder and the director
        // will then direct all of the building
        CarDirector director = new CarDirector(carBuilder);
        director.build();

        // get the sedan car and assign it to a higher abstraction i.e.
        // Car so it can easily be swapped out later if needed
        Car car = carBuilder.getCar();
        System.out.println(car);


        // we get a new request for a sports car
        carBuilder = new SportsCarBuilder();
        // again pass it into our director who does all the building for us!
        director = new CarDirector(carBuilder);
        director.build();
        // now everything has been built up and so we simply just return the car
        car = carBuilder.getCar();
        System.out.println(car);

        /**
         * Okay so what exactly is going on here?
         *
         * Well the Builder Pattern remember is to take out the complexity of building a bunch of different
         * kinds of the Same Class, -> think along the lines of multiple constructors, do we really want an Object
         * with a billion different Constructors? And each one of those Constructors having it's own specific
         * methods to cater to that specific Object?
         *
         * Think about how having both a SportsCarConstructor within Car to return a sportsCar would
         * require it's own specific instance variables i.e. sportsCar, sportsCarStyle, etc. And Sedan
         * would appropriately have it's own and the methods would then need to set each appropriately based
         * on the Constructor called i.e. call specific methods in the Constructor on the build of a different
         * type of car! Very complicated.
         *
         * The Builder pattern allows us to abstract out into specific Builder classes (Concrete Objects) which
         * will appropriately build up the according functionalities in that Builder class and then return a concrete
         * Object which corresponds to the type of object that the user wanted.
         *
         * i.e. Here we have one overarching Car object which can be constructed into many different flavors
         * of cars.
         *
         * We then break out into a CarBuilder interface which defines the exact build styles that every car
         * has (these are what are unique amongst the different constructions).
         * We then implement that interface into different Builder objects (Sedan, SportsCar etc.) and each
         * one of those builder objects will uniquely implement their own style and at the end
         * return the car appropriately flavored.
         *
         * Here we also have the addition of a director who takes care of all the building calling.
         *
         * This is better in the sense that we don't have to have the carBuilder actually build every thing
         * imaging * calling every single method every single time ... instead the director will take care
         * of that building for us!
         *
         * After the build is done we just return the car from the carBuilder object, and voila!!
         *
         * So this is what happens:
         *
         * we first create a SedanCarBuilder because a client asked us for it * imagine it lol.
         * then we create our CarDirector
         * we then ask carDirector to build the car up for us
         * and then we directly ask builder (what has been built by the director) to give us the car.
         *
         * then the same thing is done for the SportsCar object!
         *
         * This approach is flexible in the fact that now we can add a bunch of other Builder objects without changing
         * any existing code i.e. think of the Car class and adding new constructors with new methods ... BOOM!
         *
         * Come to review later
         *
         *
         *
         * */


    }
}
