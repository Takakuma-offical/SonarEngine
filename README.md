# SonarEngine

SonarEngine is an open-source game engine developed using the Java programming language.

The engine is written entirely in Java, and game creators also build their games using Java.
SonarEngine is structured into two main parts: the **Engine** and the **Project**.
Game developers typically create their games on the **Project** side, while the **Engine** provides the core functionality.

The engine uses a **GameObject** and **Component** architecture.
GameObjects call and manage Components, and all GameObjects are managed in `Main.java` to construct the game logic.

SonarEngine is designed to be relatively easy to understand and use for Java developers.
Most features are separated by responsibility, resulting in a clear and modular structure within Java.

To fully understand how SonarEngine works, it is recommended to not only read the documentation, but also explore the `SampleGameObject` and `SampleComponent` included in the Project, as well as the source code of the GameEngine itself.

## License

SonarEngine is released under the **GNU General Public License (GPL)**.
