package com.nikhil.suitesphere.services;

import com.nikhil.suitesphere.dtos.Response;
import com.nikhil.suitesphere.dtos.RoomDTO;
import com.nikhil.suitesphere.enums.RoomType;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.List;

public interface RoomService {

    Response addRoom(RoomDTO roomDTO, MultipartFile imageFile);

    Response updateRoom(RoomDTO roomDTO, MultipartFile imageFile);

    Response getAllRooms();

    Response getRoomById(Long id);

    Response deleteRoom(Long id);

    Response getAvailableRooms(LocalDate checkInDate, LocalDate checkOutDate, RoomType roomType);

    List<RoomType> getAllRoomTypes();

    Response searchRoom(String input);
}
