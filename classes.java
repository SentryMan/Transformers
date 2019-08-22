class Transformer{
 private String side = "cybertron";

 void setSide (String s){

    side = (s == "good") ? "Autobot" : "Decepticon";

 }

 String getSide(){return side;}

 String battlecry(){

    String classicPhrase;

    classicPhrase = (side == "Autobot") ? "Autobots, transform and rollout!" : "Decepticons attack!";

    return classicPhrase;
 }
}


class classes{

    public static void main(String[] args) {
        
        Transformer OptimusPrime = new Transformer();
        Transformer Megatron = new Transformer();

        OptimusPrime.setSide("good");
        Megatron.setSide("bad");

        System.out.println("\nOptimus is an " + OptimusPrime.getSide() +
       "\n\nClassic phrase:\n" + OptimusPrime.battlecry());

        System.out.println("\nMegatron is a " + Megatron.getSide() +
       "\n\nClassic phrase:\n" + Megatron.battlecry());
    }
}