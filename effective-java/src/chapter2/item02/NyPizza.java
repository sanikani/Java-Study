package chapter2.item02;

public class NyPizza extends Pizza {
    public enum Size {SMALL, MEDIUM, LARGE}
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder>{
        private final Size size;

        public Builder(Size size){
            this.size = size;
        }

        @Override
        public NyPizza build(){
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder){
        super(builder);
        size = builder.size;
    }
}
