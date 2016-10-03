/**
 * Created by t00191728 on 03/10/2016.
 */
public enum Type {

    ELECTRIC ,ACOUSTIC;

    public String toString(){
        switch (this){
            case ELECTRIC:
                return "Electric";
            case ACOUSTIC:
                return "Acoustic";
            default: return "unspecified";

        }
    }
}
