public enum RoomType {
    STANDARD {
        @Override
        public void TypeInfo() {
            System.out.println("Standard");
        }
    },
    SUITE {
        @Override
        public void TypeInfo() {
            System.out.println("Suite");
        }
    },
    DELUX {
        @Override
        public void TypeInfo() {
            System.out.println("Delux");
        }
    };

    public abstract void TypeInfo();
}
