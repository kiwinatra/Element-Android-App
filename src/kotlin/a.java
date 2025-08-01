package com.example.core;

/**
 * Базовый интерфейс для реализации основных контрактов системы.
 * Определяет общее поведение для всех реализующих классов.
 */
public interface CoreContract {

    /**
     * Пример базового метода интерфейса.
     * Реализующие классы должны предоставить свою реализацию.
     */
    void execute();

    /**
     * Возвращает статус выполнения контракта.
     * @return true если контракт выполнен успешно, false в противном случае
     */
    boolean isCompleted();

    /**
     * Пример метода с параметрами.
     * @param inputData входные данные для обработки
     * @return результат выполнения операции
     */
    default String process(String inputData) {
        return inputData != null ? inputData.trim() : "";
    }
}