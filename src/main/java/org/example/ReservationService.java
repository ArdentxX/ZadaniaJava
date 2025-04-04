package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReservationService {
    p???? s???? f???? String FILE_PATH = "??????";
    private List<Reservation> reservations;

    public ReservationService() {
        ????.reservations = loadReservations();
    }

    ???? List<Reservation> loadReservations() {
        "??????" objectMapper = new ObjectMapper();
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        try {
            return ??????.readValue(file, new TypeReference<List<Reservation>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
