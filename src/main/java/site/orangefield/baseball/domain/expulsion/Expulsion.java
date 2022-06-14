package site.orangefield.baseball.domain.expulsion;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import site.orangefield.baseball.domain.player.Player;

@EntityListeners(AuditingEntityListener.class)
@Entity
public class Expulsion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100, nullable = true)
    private String reason;

    @JoinColumn(name = "playerId")
    @ManyToOne
    private Player player;

    @CreatedDate // insert할 때 동작
    private LocalDateTime createDate;
}
