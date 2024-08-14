package payorder.payservice.application.product

import payorder.payservice.presentation.dto.CreateProductRequest
import payorder.payservice.presentation.dto.ProductResponse

interface ProductService {
    suspend fun createProduct(request: CreateProductRequest)
    suspend fun queryById(id: String): ProductResponse
}