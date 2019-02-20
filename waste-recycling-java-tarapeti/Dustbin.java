public class Dustbin {
    
    String _color;
    PaperGarbage[] _paperContent;
    PlasticGarbage[] _plasticContent;
    Garbage[] _houseWasteContent;

    public Dustbin(String color) {
        _color = color;
        _paperContent = new PaperGarbage[0];
        _plasticContent = new PlasticGarbage[0];
        _houseWasteContent = new Garbage[0];
    }

    public PaperGarbage[] getPaperContent(){
        return _paperContent;
    }

    public PlasticGarbage[] getPlasticContent(){
        return _plasticContent;
    }

    public Garbage[] getHouseWasteContent(){
        return _houseWasteContent;
    }

    public void displayContents(){
        System.out.println(color + "Dustbin");

        System.out.println("House waste content: " + _houseWasteContent.lenght + " item(s)");

        for (i = 0; i< _houseWasteContent.lenght;i++){
            System.out.println(Garbage[i]);  
        }

        System.out.println("Paper content: " + _paperContent.lenght + " item(s)");

        for (i=0;i< _paperContent.lenght;i++){
            System.out.println(PaperGarbage[i]);
        }

        System.out.print("Plastic content: "+ _plasticContent.lenght + " item(s)");

        for (i=0;i< _plasticContent.lenght;i++){
            System.out.println(PlasticGarbage[i]);
        }


    }

    public void throwOutGarbage(Garbage garbage) throws DustbinContentException{

    }

    public void emptyContents(){

    }

}
