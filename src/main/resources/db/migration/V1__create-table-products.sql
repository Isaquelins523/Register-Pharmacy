CREATE TABLE products (
    id TEXT PRIMARY KEY UNIQUE NOT NULL,
    name TEXT NOT NULL,
    description TEXT NOT NULL,
    price_in_cents INTEGER NOT NULL,
    stock_quantity INTEGER NOT NULL,
    requires_prescription BOOLEAN NOT NULL DEFAULT FALSE,
    ean_code TEXT NOT NULL
)