package decouv.spring.service;

import decouv.spring.entity.GameCharacter;
import decouv.spring.repository.GameCharacterRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GameCharacterService {
    private final GameCharacterRepository gameCharacterRepository;

    public GameCharacterService(GameCharacterRepository gameCharacterRepository) {
        this.gameCharacterRepository = gameCharacterRepository;
    }

    public void createGameCharacter(GameCharacter gameCharacter) {
        this.gameCharacterRepository.save(gameCharacter);
    }

    public GameCharacter getGameCharacter(int id) {
        Optional<GameCharacter> optionalGameCharacter = this.gameCharacterRepository.findById(id);
        return optionalGameCharacter.orElse(null);
    }

    public void deleteGameCharacter(int id) {
        this.gameCharacterRepository.deleteById(id);
    }
}

