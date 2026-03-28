package exercicios.ex08.facade;

import exercicios.ex08.facade.dominio.Cliente;
import exercicios.ex08.facade.dominio.Reserva;
import exercicios.ex08.facade.subsistemas.*;

public class ViagemFacade {
    private VooService vooService = new VooService();
    private HotelService hotelService = new HotelService();
    private TransportService transportService = new TransportService();
    private ComprovanteService comprovanteService = new ComprovanteService();
    private NotificacaoService notificacaoService = new NotificacaoService();

    public Reserva reservarViagem(Cliente cliente, String destino) {
        vooService.reservarVoo(destino);
        hotelService.reservarHotel(destino);
        transportService.reservarTransporte(destino);
        Reserva reserva = comprovanteService.gerarComprovante(destino);
        notificacaoService.enviarConfirmacao(cliente, reserva);
        return reserva;
    }
}