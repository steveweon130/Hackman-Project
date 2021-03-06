public class HangingMan {
    private int numWrongGuesses;
    private String[] HangmanImage = {   "                ◎\n"+
                                        "             〇     ⦿\n"+
                                        "/̵͇̿̿/'̿̿ ̿̿ ̿̿                    ○                  ○ \n"+
                                        "             〇    〇 \n"+
                                        "                〇",
        
                                        "                ◎\n"+
                                        "             〇     〇 \n"+
                                        "/̵͇̿̿/'̿̿ ̿̿ ̿̿                   ○                   ⦿        *click \n"+
                                        "             〇    〇 \n"+
                                        "                〇",
                                    
                                        "                ◎\n"+
                                        "             〇     〇 \n"+
                                        "/̵͇̿̿/'̿̿ ̿̿ ̿̿                   ○                  ○ \n"+
                                        "             〇    ⦿  *click\n"+
                                        "                〇",
                                    
                                        "                ◎\n"+
                                        "             〇     〇 \n"+
                                        "/̵͇̿̿/'̿̿ ̿̿ ̿̿                   ○                  ○ \n"+
                                        "             〇    〇 \n"+
                                        "                ⦿  *click",
                                        
                                        
                                        "                ◎\n"+
                                        "             〇     〇 \n"+
                                        "/̵͇̿̿/'̿̿ ̿̿ ̿̿                   ○                  ○ \n"+
                                        "    *click   ⦿    〇 \n"+
                                        "                〇",
                                        
                                        
                                        "                ◎\n"+
                                        "             〇     〇 \n"+
                                        "/̵͇̿̿/'̿̿ ̿̿ ̿̿      *click     ⦿                  ○ \n"+
                                        "             〇    〇 \n"+
                                        "                〇",
                                        
                                        
                                        "                ◎\n"+
                                        "    *click   ⦿     〇 \n"+
                                        "/̵͇̿̿/'̿̿ ̿̿ ̿̿                    ○                 ○ \n"+
                                        "             〇    〇 \n"+
                                        "                〇",
                                    };
    
    public HangingMan() {
        numWrongGuesses = 0;
    }
    
    public boolean isntDead() {
        return numWrongGuesses < HangmanImage.length;
    }
    
    public void show() {
        System.out.println(HangmanImage[numWrongGuesses]);
    }
    
    public void dieSomeMore() {
        numWrongGuesses++;
    }
}
