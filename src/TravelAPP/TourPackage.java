package TravelAPP;

public enum TourPackage   {

    BEACH_HOLIDAY{
        @Override
        public void diplayInfo() {
            System.out.println("Cimerlik");
        }
    },
    CITY_TOUR {
        @Override
        public void diplayInfo() {
            System.out.println("City");
        }
    },
    MOUNTAIN_ADVENTURE {
        @Override
        public void diplayInfo() {
            System.out.println("Dag");
        }
    },
    CRUISE_TRIP {
        @Override
        public void diplayInfo() {
            System.out.println("Dolasmaq");
        }
    },
    DESERT_SAFARI {
        @Override
        public void diplayInfo() {
            System.out.println("Sehra");
        }
    };

    public abstract void diplayInfo();


}
