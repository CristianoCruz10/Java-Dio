public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
            System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(13);
             System.out.println("Qual canal a TV está: " + smartTv.canal);

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Qual canal a TV está: " + smartTv.canal);
        System.out.println("Qual o volumne atual: " + smartTv.volume);

            smartTv.ligar();
                System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

            smartTv.desligar();
                System.out.println("Novo Status da TV -> TV ligada? " + smartTv.ligada);
    }
}
