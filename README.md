# Book-Inventory-Management

# Dependencies used
  1.Spring Web
  
  2.Spring DataJPA
  
  3.Spring Security
  
  4.Spring Validation
  
  5.Spring Actuator
  
# Implementation
  
  1. Models are Book(metadata : id and inventoryCount), User(Name and Password). 
  2. Each model has repository for persisting and accessing data. Repositories created are BookRepository and UserRepository.
  3. Two Controllers are created - BookController and UserController.BookController uses APIs to add, update and remove from the inventory. With UserRepository users can register/login their stores. 
  4. In security packages, SecurityConfiguration allows users to be authenticated.Spring Security will load User details to perform authentication & authorization. So it has UserDetailsService interface.
