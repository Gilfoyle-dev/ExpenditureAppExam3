package uz.gita.examgroup3.domain.repository

import kotlinx.coroutines.flow.Flow

interface ExpenditureRepository {
    suspend fun isIntroOpen(state: Boolean): Flow<Boolean>

}