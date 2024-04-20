package com.aryan.stockmarketapp.domain.repository

import com.aryan.stockmarketapp.domain.model.CompanyListing
import com.aryan.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {
    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
}