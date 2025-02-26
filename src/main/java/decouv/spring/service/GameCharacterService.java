package decouv.spring.service;

import decouv.spring.entity.GameCharacter;
import decouv.spring.repository.GameCharacterRepository;
import org.springframework.stereotype.Service;

@Service
public class GameCharacterService {
    private final GameCharacterRepository gameCharacterRepository;

    public GameCharacterService(GameCharacterRepository gameCharacterRepository) {
        this.gameCharacterRepository = gameCharacterRepository;
    }

    public void createGameCharacter(GameCharacter gameCharacter) {
        System.out.println("Reçu : " + gameCharacter); // Debug
        this.gameCharacterRepository.save(gameCharacter);
    }
}

