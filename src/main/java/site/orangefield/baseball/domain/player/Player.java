package site.orangefield.baseball.domain.player;

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

import site.orangefield.baseball.domain.team.Team;

@EntityListeners(AuditingEntityListener.class)
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 60, nullable = false)
    private String name;

    @Column(length = 60, nullable = false)
    private String position;

    @JoinColumn(name = "teamId")
    @ManyToOne
    private Team team;

    @CreatedDate // insert할 때 동작
    private LocalDateTime createDate;
}
