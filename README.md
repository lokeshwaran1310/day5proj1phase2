# 🐞 Simple Bug Tracker – Phase 2 (Java + PostgreSQL)

**Description:**  
This is the **second phase** of a Java-based console bug tracking system using JDBC with a PostgreSQL backend. This version includes full CRUD operations — users can **insert**, **view**, **update**, and **delete** bugs through a menu-driven interface. Bug records include a `title`, `description`, `status`, and auto-incremented `id`.

---

**Components:**  
- **`DbUtil.java`**  
  Handles PostgreSQL database connections using JDBC.

- **`Bug.java`**  
  Represents the bug model with fields `id`, `title`, `description`, and `status`.

- **`Bugdao.java`**  
  DAO class that performs core database operations:
  - `insertBug()` – Adds new bug records.
  - `Display()` – Retrieves and returns all bug entries.
  - `update()` – Updates the status of a bug by ID.
  - `delete()` – Deletes a bug by ID.

- **`Main.java`**  
  Main menu-driven application that:
  - Accepts user input for bug details.
  - Displays all bug records.
  - Deletes a bug by ID.
  - Updates a bug’s status by ID.
  - Provides a clean exit option.

---

**Design Highlights:**  
- 🧩 Fully modular — separates concerns between model, DAO, utility, and application logic.  
- 🧪 **Interactive menu-driven console UI** to manage bugs.  
- 🛡️ Uses `PreparedStatement` for secure database operations.  
- 🧹 List of bugs is sorted by ID before display.  
- 🐘 Built for PostgreSQL using standard JDBC (easily adaptable to other RDBMS).  
- 🔄 Easily extensible for future features like filtering by status, timestamps, or priority.

---

**Purpose:**  
This phase enhances the original learning project into a more functional bug tracking system with real-world-style CRUD capabilities. It’s ideal for students or beginners to understand full data flow from Java console input to SQL operations and back.

---

**Author:**  
**Lokeshwaran M**  
📧 lokeshwaran.m@epssw.com
