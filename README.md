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

## Development Status & Contributions

SonarEngine is currently under active development, and not all features are guaranteed to work fully at this stage.

We are also welcoming proposals for additional features as a game engine.
If you have ideas for new functionality, such as Java-based system Components or other engine-related features, please submit them as **Add-ons** via the GitHub Project Issues.

When a submitted Add-on or feature proposal is adopted into the engine, the contributor will be credited as a **SonarEngine contributor** in this README.


## License

SonarEngine is released under the **GNU General Public License (GPL)**.
