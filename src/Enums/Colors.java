package Enums;

public class Enums {

        enum Color{
            RED("red"), BLUE("blue"), GREEN("green");

            private String value;

            Color(String value){
                this.value = value;
            }

            public String getValue() {
                return value;
            }
        }

}
