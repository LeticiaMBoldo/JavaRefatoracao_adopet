package br.com.alura;

import br.com.alura.client.ClientHTTPConfiguration;
import br.com.alura.service.AbrigoService;

import java.io.IOException;

public class ListarAbrigoCommand implements Command{

    @Override
    public void execute() {
        try {
            ClientHTTPConfiguration client = new ClientHTTPConfiguration();
            AbrigoService abrigoService = new AbrigoService(client);
            abrigoService.listarAbrigos();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
