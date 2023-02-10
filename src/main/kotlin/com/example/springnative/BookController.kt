package com.example.springnative

import jakarta.transaction.Transactional
import org.springframework.data.repository.findByIdOrNull
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@Transactional
@RestController
@RequestMapping(value = ["/api/books"])
class BookController(
  private val repository: BookRepository
) {

  @GetMapping(value = ["/"])
  fun findBooks(): Collection<Book> {
    return repository.findAll()
  }

  @GetMapping(value = ["/{id}"])
  fun findById(@PathVariable id: String): Book? {
    return repository.findByIdOrNull(id)
  }

//  @PutMapping(value = ["/{id}"])
//  @ResponseStatus(HttpStatus.OK)
//  fun updateBook(@PathVariable("id") id: String, @RequestBody book: Book) = findById(id)?.let {
//    it.title = book.title
//    it.author = book.author
//    repository.save(it)
//  } ?: repository.save(book)
}
