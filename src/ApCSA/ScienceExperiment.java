//package ApCSA;
//
//import java.util.ArrayList;
//
//public class ScienceExperiment {
//
//    private ArrayList<Trial> trialList;
//
//    //Part A
//        public double getCompoundAvg (String comp) {
//            double temp = 0;
//            int size = 0;
//            for(int i = 0; i <trialList.size();i++) {
//                if(comp.equals(trialList.get(i).getCompound())) {
//                    temp += trialList.get(i).getTemp();
//                    size += 1;
//                }
//            }
//            if (size == 0) {
//                return -1.0;
//            }
//            return  temp/size;
//
//        }
//
//        //Part B
//        public String getCompoundWithHighestAvg() {
//            ArrayList<String> compounds = getCompundList();
//            String s = "";
//            double max = 0;
//            for (int i = 0; i < compounds.size(); i++){
//                if(getCompoundAvg(compounds.get(i)) > max){
//                    max = getCompoundAvg(compounds.get(i));
//                    s = compounds.get(i);
//                }
//            }
//            return s;
//        }
//
//
//}
