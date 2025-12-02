import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

// https://vite.dev/config/
export default defineConfig({
  plugins: [react()],
  server: {
    port: 5173,
    proxy: {
      // All API calls that start with /api go to Spring Boot
      '/api': {
        target: 'http://localhost:8080',   // your Spring Boot port
        changeOrigin: true,
        secure: false,
        // Optional: rewrite /api → nothing (if you don’t want /api prefix in backend)
        // rewrite: (path) => path.replace(/^\/api/, '')
      },
    },
  },
})
