//package com.CodeWithAman;
//
//import java.util.List;
//
//public class SOF2 {
//
//
//    public class Dishwasher {
//
//        public enum CleanStatus{CLEAN, DIRTY}
//        public int capacity;
//        public int count;
//        public CleanStatus status;
//        public Dishwasher dw20 = new Dishwasher(20);
//
//        public Dishwasher(int capacity) {
//
//        }
//
//        public int getCapacity() {
//
//            return capacity;
//
//        }
//
//        public int getDishCount(){
//
//            //I want to call the count of dishes that are defined by the Dish.class
//            Dish dish = new Dish(null); //is this right? Does it need to be something other than 'null'?
//
//            count = dish.hashCode();
//
//            return count;
//
//        }
//
//        public CleanStatus getCleanStatus() {
//
//            if (getAllDishes() == null){
//
//                return CleanStatus.DIRTY;
//
//            }
//
//            return CleanStatus.CLEAN;
//
//        }
//
//        public void addDish(Dish newDish) {
//
//            while (capacity < 20) {
//                //add dishes
//                count += 1;
//
//                if (capacity >= 20) {
//
//                    System.out.println("Dishwasher is full.");
//
//
//                }
//            }
//
//        }
//
//        public List<Dish> getAllDishes() {
//
//
//            //how would I define this list?
//
//
//        }
//
//        public void emptyDishwasher() {
//
//            if (CleanStatus.CLEAN != null && count == 20) {
//
//                count = 0;
//
//            }
//
//        }
//
//        public void washDishes() {
//
//            if (CleanStatus.DIRTY != null && count == 20) {
//
//                status = CleanStatus.CLEAN;
//
//            }
//        }
//    }
//
//    class Dish {
//        private final String type;
//
//        public Dish(String type) {
//            this.type = type;
//        }
//
//        public String getType() {
//            return type;
//        }
//
//        @Override
//        public boolean equals(Object other) {
//            if (this == other) return true;
//            if (other == null || getClass() != other.getClass()) return false;
//            Dish otherDish = (Dish) other;
//            return type.equals(otherDish.type);
//        }
//
//        @Override
//        public int hashCode() {
//            return getType().hashCode();
//        }
//    }
//}
