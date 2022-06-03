package com.example.roomapp.repository

import androidx.lifecycle.LiveData
import com.example.roomapp.data.ProductDao
import com.example.roomapp.model.Product

class ProductRepository(private val productDao: ProductDao) {

    val readAllData: LiveData<List<Product>> = productDao.readAllData()

    suspend fun addProduct(product: Product){
        productDao.addProduct(product)
    }

    suspend fun updateProduct(product: Product){
        productDao.updateProduct(product)
    }

    suspend fun deleteProduct(product: Product){
        productDao.deleteProduct(product)
    }

    suspend fun deleteAllProducts(){
        productDao.deleteAllProducts()
    }

}