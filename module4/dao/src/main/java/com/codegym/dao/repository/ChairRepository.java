package com.codegym.dao.repository;
import com.codegym.dao.entity.Chair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface ChairRepository extends JpaRepository<Chair,Integer> {
    @Query(value = "select * from chair c inner join booking_detail bd on c.id_chair=bd.id_chair "+
            "inner join booking b on bd.id_booking=b.id_Booking "+
            "inner join show_time st on b.id_show=st.id_show_time "+
            "where st.id_show_time =?1 ", nativeQuery = true)
    List<Chair> findAllByIdShowTime(int id);
    @Query("select c from Chair c where c.room.idRoom =:idRoom")
    List<Chair> findAllByIdRoom(int idRoom);
}

