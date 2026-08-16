package br.com.alura;

import br.com.alura.client.ClientHTTPConfiguration;
import br.com.alura.service.PetService;

import java.io.IOException;

public class importarPetsDoAbrigoCommand implements Command{
    @Override
    public void execute() {
        try {
            ClientHTTPConfiguration client = new ClientHTTPConfiguration();
            PetService petService = new PetService(client);

            petService.importarPetsDoAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
