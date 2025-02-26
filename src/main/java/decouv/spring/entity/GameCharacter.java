package decouv.spring.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "GAMECHARACTERS")
public class GameCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // Utilise Integer et non int pour éviter les problèmes d'initialisation

    private int hp;

    public GameCharacter() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    @Override
    public String toString() {
        return "GameCharacter{" +
                "id=" + id +
                ", hp=" + hp +
                '}';
    }

}

