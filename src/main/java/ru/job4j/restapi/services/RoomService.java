package ru.job4j.restapi.services;

import org.springframework.stereotype.Service;
import ru.job4j.restapi.domains.Room;
import ru.job4j.restapi.repositpries.RoomRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> findAllRoom() {
        return roomRepository.findAll();
    }

    public Optional<Room> findRoomById(Integer id) {
        return roomRepository.findById(id);
    }
}
