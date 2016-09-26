/**
 * Created by t00191728 on 26/09/2016.
 */
public enum Wood {

    INDIAN_ROSEWOOD, SITKA,ALDER,MAHOGANY,ADIRONDACK,BRAZILIAN_ROSEWOOK,CEDAR,COCOBOLO,MAPLE;

    public String toString(){
        switch (this){
            case INDIAN_ROSEWOOD:
                return "Indian Rosewood";
            case SITKA:
                return "Sitka";
            case ALDER:
                return "Alder";
            case MAHOGANY:
                return "Mahogany";
            case ADIRONDACK:
                return "Adirondack";
            case BRAZILIAN_ROSEWOOK:
                return "Brazilian Rosewood";
            case CEDAR:
                return "Cedar";
            case COCOBOLO:
                return "Cocobolo";
            case MAPLE:
                return  "Maple";
            default: return "unspecified";

        }
    }
}
