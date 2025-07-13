package ru.skillfactorydemo.tgbot.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import ru.skillfactorydemo.tgbot.entity.ActiveChat;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class ActiveChatRepositoryTest {

    @Autowired
    private ActiveChatRepository repository;

    @Test
    void testFindActiveChatByChatId_ExistingChat() {
        // Создаем тестовый объект
        ActiveChat chat = new ActiveChat();
        chat.setChatId(123L);
        repository.save(chat);

        // Проверяем поиск существующего чата
        Optional<ActiveChat> foundChat = repository.findActiveChatByChatId(123L);
        assertTrue(foundChat.isPresent());
        assertEquals(123L, foundChat.get().getChatId());
    }

    @Test
    void testFindActiveChatByChatId_NonExistingChat() {
        // Проверяем поиск несуществующего чата
        Optional<ActiveChat> foundChat = repository.findActiveChatByChatId(999L);
        assertFalse(foundChat.isPresent());
    }
}
