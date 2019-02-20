public class PaperGarbage extends Garbage {
    boolean _isSqueezed = false;

    public PaperGarbage(String litter, Boolean isSqueezed){
        super(litter);
        _isSqueezed = isSqueezed;
    }

    public void squeeze(){
        _isSqueezed = true;
    }

    public boolean isSqueezed(){
        if (_isSqueezed == true){
            return true;
        }
        return false;
    }
}
