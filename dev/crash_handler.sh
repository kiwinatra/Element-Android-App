#!/bin/bash
# Сбор логов от adb
adb logcat -d > "crashes/$(date +%Y-%m-%d_%H-%M-%S).log"
# Фильтрация по ключевым словам
grep -E "Crash|Exception|FATAL" crashes/*.log