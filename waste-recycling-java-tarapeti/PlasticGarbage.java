public class PlasticGarbage extends Garbage {
    boolean _isClean = false;

    public PlasticGarbage(String litter, boolean isClean){
        super(litter);
        _isClean = isClean;
    }

    public void clean(){
        _isClean = true;
    }

    public boolean isClean(){
        if (_isClean == true){
            return true;
        }
        return false;
    }


}
