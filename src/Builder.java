/**
 * Created by t00191728 on 26/09/2016.
 */
public enum Builder {

    RYAN,PRS,COLLINGS,OLSON,MARTIN,FENDER,GIBSON;

    public String toString(){
        switch (this){
            case RYAN:
                return "Ryan";
            case PRS:
                return "PRS";
            case COLLINGS:
                return "Collings";
            case OLSON:
                return "Olson";
            case MARTIN:
                return "Martin";
            case FENDER:
                return "Fender";
            case GIBSON:
                return "Gisbon";
            default: return "unspecified";

        }
    }

}
