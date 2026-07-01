import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testGetUserName() {
        // Arrange
        UserRepository mockRepository = mock(UserRepository.class);
        when(mockRepository.findNameById(1)).thenReturn("John Doe");

        UserService userService = new UserService(mockRepository);

        // Act
        String name = userService.getUserName(1);

        // Assert
        assertEquals("John Doe", name);
    }
}
