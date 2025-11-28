# IgnoreSkullErrors

## 🇷🇺 Русская версия

**IgnoreSkullErrors** — плагин для Spigot/Paper 1.20.1, который **скрывает предупреждения Authlib**, возникающие при попытке сервера загрузить профиль игрока для голов (Player Heads).

### ❓ Что за предупреждение?
На оффлайн-серверах или серверах без доступа к Mojang API часто появляется:

> Couldn't look up profile properties\
AuthenticationUnavailableException: Cannot contact authentication server

### ✔ Что делает плагин
- Не изменяет механику черепов и скинов  
- Не отключает загрузку текстур  
- Не вмешивается в Networking/Authlib  
- **Просто фильтрует конкретные сообщения логгера**, чтобы они не выводились в консоль

### 🔧 Установка
1. Скомпилируйте плагин (или используйте готовый `.jar`)  
2. Поместите его в папку `/plugins`  
3. Запустите сервер

### 📌 Совместимость
- Spigot 1.20.1  
- Paper 1.20.1  
- Purpur 1.20.1  
- Java 17+

---

## 🇬🇧 English version

**IgnoreSkullErrors** — a Spigot/Paper 1.20.1 plugin that **suppresses Mojang Authlib warnings** caused by the server attempting to fetch player profile properties for Player Heads.

### ❓ What is this warning?
Offline servers or servers without a connection to Mojang may repeatedly log:

> Couldn't look up profile properties\
AuthenticationUnavailableException: Cannot contact authentication server

### ✔ What the plugin does
- Does NOT change head/skin mechanics  
- Does NOT disable skin loading  
- Does NOT interfere with networking/Authlib  
- **Simply filters out specific log messages** so they never appear in console

### 🔧 Installation
1. Compile the plugin (or use a precompiled `.jar`)  
2. Place it into the `/plugins` folder  
3. Start your server

### 📌 Compatibility
- Spigot 1.20.1  
- Paper 1.20.1  
- Purpur 1.20.1  
- Java 17+
