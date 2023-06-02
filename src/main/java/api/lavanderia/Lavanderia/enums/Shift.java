package api.lavanderia.Lavanderia.enums;

public enum Shift {
    MORNING{
        @Override
        String getHour(){
            return "06:00 a 12:00";
        }
    },

    AFTERNOON {
        @Override
        String getHour() {
            return "12:00 a 18:00";
        }
    };


    abstract String getHour();
}
