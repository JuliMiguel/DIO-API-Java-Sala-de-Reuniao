package com.dio.SalaDeReuniao.Repository;

import com.dio.SalaDeReuniao.Model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

}
