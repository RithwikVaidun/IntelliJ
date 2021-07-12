//package ApCSA;
//
//import java.util.ArrayList;
//
//public class OnlinePurchaseManager {
//    private ArrayList<Gizmo> purchases;
//
//    public int countElectronicsByMaker(String maker) {
//        int count = 0;
//        for(int i = 0; i<purchases.size(); i++) {
//            if(purchases.get(i).getMaker() == maker && purchases.get(i).isElectronic == true) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public boolean hasAdjacentEqualPair(String maker) {
//        for(int i = 0; i<purchases.size() -1; i++) {
//            if(purchases.get(i).equals(purchases.get(i+1))) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//}
