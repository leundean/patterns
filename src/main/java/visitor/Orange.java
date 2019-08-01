package visitor;

public class Orange {

        private double price = 3;
        private boolean seedless = false;
        private boolean peel = true;

        public Orange() {}

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public boolean isSeedless() {
            return seedless;
        }

        public void setSeedless(boolean seedless) {
            this.seedless = seedless;
        }

        public boolean isPeel() {
            return peel;
        }

        public void setPeel(boolean peel) {
            this.peel = peel;
        }

        public void accept(Visitor visitor){
            visitor.peelOrange(this);
            visitor.setOrangePrice(this, 2.00);
        }

    }
